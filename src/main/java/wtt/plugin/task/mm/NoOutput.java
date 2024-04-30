package wtt.plugin.task.mm;

import java.util.List;

import io.kestra.core.exceptions.IllegalVariableEvaluationException;
import io.kestra.core.models.executions.Execution;
import io.kestra.core.models.executions.NextTaskRun;
import io.kestra.core.models.executions.TaskRun;
import io.kestra.core.models.hierarchies.AbstractGraph;
import io.kestra.core.models.tasks.FlowableTask;
import io.kestra.core.models.tasks.ResolvedTask;
import io.kestra.core.models.tasks.Task;
import io.kestra.core.models.tasks.VoidOutput;
import io.kestra.core.runners.RunContext;

public class NoOutput extends Task implements FlowableTask<VoidOutput> {
	
	public VoidOutput run(RunContext runContext) throws Exception {
		return null;
	}

	@Override
	public List<Task> getErrors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractGraph tasksTree(Execution execution, TaskRun taskRun, List<String> parentValues)
			throws IllegalVariableEvaluationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> allChildTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResolvedTask> childTasks(RunContext runContext, TaskRun parentTaskRun)
			throws IllegalVariableEvaluationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NextTaskRun> resolveNexts(RunContext runContext, Execution execution, TaskRun parentTaskRun)
			throws IllegalVariableEvaluationException {
		// TODO Auto-generated method stub
		return null;
	}
}
