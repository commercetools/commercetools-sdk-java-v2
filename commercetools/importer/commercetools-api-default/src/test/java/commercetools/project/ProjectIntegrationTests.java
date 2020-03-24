package commercetools.project;

import com.commercetools.api.generated.models.project.Project;
import com.commercetools.api.generated.models.project.ProjectChangeCountriesActionBuilder;
import com.commercetools.api.generated.models.project.ProjectUpdateAction;
import com.commercetools.api.generated.models.project.ProjectUpdateBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjectIntegrationTests {
    
    @Test
    public void byKeyGet() throws Exception {
        String projectKey = CommercetoolsTestUtils.getProjectKey();
        Project project = CommercetoolsTestUtils.getApiRoot().withProjectKey(projectKey)
                .get()
                .executeBlocking().getBody();
        Assert.assertNotNull(project);
        Assert.assertEquals(projectKey, project.getKey());
    }
    
    @Test
    public void updateProject() throws Exception {
        List<String> countries = Arrays.asList("DE");
        List<ProjectUpdateAction> updateActions = new ArrayList<>();
        updateActions.add(ProjectChangeCountriesActionBuilder.of().countries(countries).build());
        Project project = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .get()
                .executeBlocking()
                .getBody();
        Project updatedProject = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .post(ProjectUpdateBuilder.of().actions(updateActions).version(project.getVersion()).build())
                .executeBlocking().getBody();
        Assert.assertNotNull(updatedProject);
    }
}
