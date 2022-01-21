
package commercetools.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.commercetools.api.models.project.Project;
import com.commercetools.api.models.project.ProjectChangeCountriesActionBuilder;
import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectUpdateBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProjectIntegrationTests {

    @Test
    public void byKeyGet() throws Exception {
        String projectKey = CommercetoolsTestUtils.getProjectKey();
        Project project = CommercetoolsTestUtils.getProjectApiRoot().get().executeBlocking().getBody();
        Assertions.assertNotNull(project);
        Assertions.assertEquals(projectKey, project.getKey());
    }

    @Test
    public void updateProject() throws Exception {
        List<String> countries = Arrays.asList("DE");
        List<ProjectUpdateAction> updateActions = new ArrayList<>();
        updateActions.add(ProjectChangeCountriesActionBuilder.of().countries(countries).build());
        Project project = CommercetoolsTestUtils.getProjectApiRoot().get().executeBlocking().getBody();
        Project updatedProject = CommercetoolsTestUtils.getProjectApiRoot()
                .post(ProjectUpdateBuilder.of().actions(updateActions).version(project.getVersion()).build())
                .executeBlocking()
                .getBody();
        Assertions.assertNotNull(updatedProject);
    }
}
