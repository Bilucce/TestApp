package com.example.testapp;

import androidx.databinding.ObservableField;

public class Work {

    private ObservableField<String> workName = new ObservableField<>();
    private ObservableField<String> workDesc = new ObservableField<>();
    private ObservableField<String> workAvatar = new ObservableField<>();

    public ObservableField<String> getWorkName() {
        return workName;
    }

    public void setWorkName(ObservableField<String> workName) {
        this.workName = workName;
    }

    public ObservableField<String> getWorkDesc() {
        return workDesc;
    }

    public void setWorkDesc(ObservableField<String> workDesc) {
        this.workDesc = workDesc;
    }

    public ObservableField<String> getWorkAvatar() {
        return workAvatar;
    }

    public void setWorkAvatar(ObservableField<String> workAvatar) {
        this.workAvatar = workAvatar;
    }
}
