package commercetools.misc;

import com.commercetools.models.project.Project;
import org.junit.Assert;
import org.junit.Test;
import utils.DefaultApiRoot;

public class DefaultApiRootTest {
    
    @Test
    public void execute() {
        Project project = DefaultApiRoot.getApiRoot().withProjectKey(System.getenv("CTP_PROJECT_KEY"))
                .get()
                .executeBlocking()
                .getBody();
        Assert.assertNotNull(project);
    }
}