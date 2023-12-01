# JAVA

public List<DadosOperacaoDashboard> listarDadosOperacaoDashboard(FiltroDashboard filtroDashboard) {
        try {
            defineParametrosFiltro(filtroDashboard);
            List<DadosOperacaoDashboard> dadosOperacaoDashboardList = repository.listarDadosOperacaoDashboard(filtroDashboard, filtroDashboard.getCdDivisaoList());
            bloquearOperacoesNascidasHoje(dadosOperacaoDashboardList);
            return dadosOperacaoDashboardList;
        } catch (Exception e) {
            log.error("Erro ao consultar estoque lf. Error: {}", e.getMessage());
            throw e;
        }
    }



     @Test
    public void testListarDadosOperacaoDashboard() {
        // Criando mocks
        FiltroDashboard filtroDashboardMock = mock(FiltroDashboard.class);
        List<DadosOperacaoDashboard> dadosOperacaoDashboardListMock = mock(List.class);
        MeuRepository repositoryMock = mock(MeuRepository.class);

        // Configurando comportamento do filtro mock
        when(filtroDashboardMock.getCdDivisaoList()).thenReturn(Arrays.asList(1, 2, 3)); // Exemplo de retorno do método getCdDivisaoList()

        // Criando uma instância do serviço que contém o método a ser testado
        MeuService meuService = new MeuService(repositoryMock);

        // Simulando a chamada do método do serviço
        when(repositoryMock.listarDadosOperacaoDashboard(eq(filtroDashboardMock), anyList()))
            .thenReturn(dadosOperacaoDashboardListMock); // Simulando o retorno do repositório

        // Chamando o método a ser testado
        List<DadosOperacaoDashboard> resultado = meuService.listarDadosOperacaoDashboard(filtroDashboardMock);

        // Verificando se os métodos internos foram chamados corretamente e se a lista foi retornada
        verify(filtroDashboardMock).getCdDivisaoList();
        verify(repositoryMock).listarDadosOperacaoDashboard(eq(filtroDashboardMock), anyList());
        assertEquals(dadosOperacaoDashboardListMock, resultado); // Verificando se o resultado é igual ao mock da lista
    }
}
