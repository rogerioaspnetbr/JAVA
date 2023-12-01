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
