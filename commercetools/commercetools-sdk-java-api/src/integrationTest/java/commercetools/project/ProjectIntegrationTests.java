
package commercetools.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.commercetools.api.models.project.Project;
import com.commercetools.api.models.project.ProjectChangeCountriesActionBuilder;
import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectUpdateBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class ProjectIntegrationTests {

    @Test
    public void byKeyGet() throws Exception {
        String projectKey = CommercetoolsTestUtils.getProjectKey();
        Project project = CommercetoolsTestUtils.getProjectRoot().get().executeBlocking().getBody();
        Assert.assertNotNull(project);
        Assert.assertEquals(projectKey, project.getKey());
    }

    @Test
    public void updateProject() throws Exception {
        List<String> countries = Arrays.asList("DE");
        List<ProjectUpdateAction> updateActions = new ArrayList<>();
        updateActions.add(ProjectChangeCountriesActionBuilder.of().countries(countries).build());
        Project project = CommercetoolsTestUtils.getProjectRoot().get().executeBlocking().getBody();
        Project updatedProject = CommercetoolsTestUtils.getProjectRoot()
                .post(ProjectUpdateBuilder.of().actions(updateActions).version(project.getVersion()).build())
                .executeBlocking()
                .getBody();
        Assert.assertNotNull(updatedProject);
    }
}
