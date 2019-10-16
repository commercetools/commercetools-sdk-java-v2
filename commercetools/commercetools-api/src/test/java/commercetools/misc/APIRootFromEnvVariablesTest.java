package commercetools.misc;

import com.commercetools.models.project.Project;
import org.junit.Assert;
import org.junit.Test;
import utils.APIRootFromEnvVariables;

public class APIRootFromEnvVariablesTest {
    
    @Test
    public void execute() {
        Project project = APIRootFromEnvVariables.getApiRoot().withProjectKey(System.getenv("CTP_PROJECT_KEY"))
                .get()
                .executeBlocking()
                .getBody();
        Assert.assertNotNull(project);
    }
}