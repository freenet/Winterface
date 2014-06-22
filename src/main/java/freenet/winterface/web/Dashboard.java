package freenet.winterface.web;

import freenet.winterface.core.VelocityBase;
import freenet.winterface.core.WinterfacePlugin;

import org.apache.velocity.context.Context;

import javax.servlet.http.HttpServletRequest;

/**
 * Test page for Velocity templates in Jetty.
 */
public class Dashboard extends VelocityBase {

	public Dashboard() {
		super("dashboard.vm");
	}

	@Override
	protected void subFillContext(Context context, HttpServletRequest request) {
	}
	
}