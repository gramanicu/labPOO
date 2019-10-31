package fourth;

import first.Task;
import third.Strategy;

import java.util.Calendar;

public class PrintTimeTaskRunner extends AbstractTaskRunner {
    public PrintTimeTaskRunner(Strategy strategy) {
        super(strategy);
    }

    @Override
    protected void afterExecution(Task task) {
        System.out.println(String.format("The hour is : %d", Calendar.HOUR));
    }
}
