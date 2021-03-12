package com.javarush.task.task32.task3209.actions;

import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StrikeThroughAction extends StyledEditorKit.StyledTextAction{


    /**
     * Creates a new StyledTextAction from a string action name.
     *
     */
    public StrikeThroughAction() {
        super("Зачеркнутый");
    }

    public StrikeThroughAction(String nm) {
        super(nm);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
