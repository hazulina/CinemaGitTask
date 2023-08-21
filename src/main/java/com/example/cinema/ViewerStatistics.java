package com.example.cinema;

import java.util.List;


public class ViewerStatistics {
    private List<Viewer> viewersList;

    double averageAge(List<Viewer> viewersList) {
        double avgAge = 0;
        for (Viewer viewer : viewersList) {
            avgAge += viewer.getAge();
        }
        return avgAge/viewersList.size();
    }


    public ViewerStatistics() {
    }

    public ViewerStatistics(List<Viewer> viewersList) {
        this.viewersList = viewersList;
    }

    public List<Viewer> getViewersList() {
        return viewersList;
    }

    public void setViewersList(List<Viewer> viewersList) {
        this.viewersList = viewersList;
    }
}
