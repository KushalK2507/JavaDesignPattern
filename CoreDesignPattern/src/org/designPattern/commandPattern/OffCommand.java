package org.designPattern.commandPattern;

public class OffCommand implements Command {

	private Television television;
	
	public OffCommand(Television television) {
		this.television= television;
	}
	@Override
	public void execute() {
television.off();
	}

}
