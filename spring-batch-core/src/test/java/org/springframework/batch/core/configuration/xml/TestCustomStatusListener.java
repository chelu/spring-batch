package org.springframework.batch.core.configuration.xml;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class TestCustomStatusListener extends AbstractTestComponent implements StepExecutionListener {

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		return new ExitStatus("FOO").and(stepExecution.getExitStatus());
	}

	@Override
	public void beforeStep(StepExecution stepExecution) {
		executed = true;
	}

}
