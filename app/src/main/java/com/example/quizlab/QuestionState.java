package com.example.quizlab;

public class QuestionState {
    //Defino variables

    private Boolean clicked;
    private Integer index;
    private Boolean button;

    public QuestionState(Boolean clicked, Boolean button Integer index){
        this.clicked = clicked;
        this.index = index;
        this.button = button;

    }

    public Boolean getButton() {
        return button;
    }

    public void setButton(Boolean button) {
        this.button = button;
    }

    public Boolean getClicked() {
        return clicked;
    }

    public void setClicked(Boolean clicked) {
        this.clicked = clicked;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index){
        this.index = index;
    }
}
