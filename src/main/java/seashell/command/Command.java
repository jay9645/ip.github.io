package seashell.command;

import seashell.storage.SaveHandler;
import seashell.exception.SeashellException;
import seashell.TaskList;

public interface Command {

    /**
     * Executes the command and returns the result.
     */
    public String execute(TaskList taskListObj, SaveHandler saveHandler) throws SeashellException;

    public boolean isExit();
}
