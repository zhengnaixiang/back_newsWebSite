package com.qf.report.vo;

public class SearchVo {
    int currentPage;
    String search;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "SearchVo{" +
                "currentPage=" + currentPage +
                ", search='" + search + '\'' +
                '}';
    }
}
