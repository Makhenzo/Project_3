package junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



    @RunWith(Suite.class)
    @Suite.SuiteClasses({SnakeCaseTest.class, CamelCaseTest.class, HumanReadableTest.class})
    public class SuiteTestAll {

        @Test
        public void contextLoads() {
        }
    }


