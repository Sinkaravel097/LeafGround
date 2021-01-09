package org.runner;

import java.awt.Button;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.leafground.ButtonTask;
import org.leafground.EditTask;
import org.pojo.classes.EditPojo;

@RunWith(Suite.class)
@SuiteClasses({EditTask.class,ButtonTask.class})
public class RunnerClass {

}
