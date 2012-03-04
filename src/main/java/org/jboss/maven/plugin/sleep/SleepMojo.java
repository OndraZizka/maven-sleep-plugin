package org.jboss.maven.plugin.sleep;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;


/**
 * Goal which sleeps for given number of seconds.
 *
 * @goal sleep
 * 
 * @phase test
 */
public class SleepMojo
    extends AbstractMojo
{
    /**
     * Number of seconds to sleep.
     * @parameter expression="${sleep.delay}"
     * @required
     */
    private Integer delay;

    public void execute() throws MojoExecutionException {
        try {
            Thread.sleep( delay * 1000 );
        } catch (InterruptedException ignore) {
        }
    }
}
