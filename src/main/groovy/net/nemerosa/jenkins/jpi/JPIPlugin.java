package net.nemerosa.jenkins.jpi;

import hudson.Extension;
import jenkins.model.GlobalConfiguration;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.StaplerRequest;

@Extension
public class JPIPlugin extends GlobalConfiguration {

    public JPIPlugin() {
        load();
    }

    @Override
    public boolean configure(StaplerRequest req, JSONObject json) throws FormException {
        save();
        return super.configure(req, json);
    }

}
