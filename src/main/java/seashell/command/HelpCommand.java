package seashell.command;

import seashell.storage.SaveHandler;
import seashell.TaskList;
import seashell.ui.Ui;

public class HelpCommand implements Command {

    @Override
    public String execute(TaskList taskList, SaveHandler saveHandler) {
        return Ui.HELP_TEXT;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
