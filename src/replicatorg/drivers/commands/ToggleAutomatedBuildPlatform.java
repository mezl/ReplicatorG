package replicatorg.drivers.commands;

import replicatorg.drivers.Driver;
import replicatorg.drivers.RetryException;

public class ToggleAutomatedBuildPlatform implements DriverCommand {

	boolean state;
	int toolhead = -1;
	public ToggleAutomatedBuildPlatform(boolean state)
	{
		super();
		this.state = state;
	}

	public ToggleAutomatedBuildPlatform(boolean state, int toolhead)
	{
		super();
		this.state = state;
		this.toolhead = toolhead;
	}

	@Override
	public void run(Driver driver) throws RetryException {
		driver.setAutomatedBuildPlatformRunning(state,toolhead );
	}

}
