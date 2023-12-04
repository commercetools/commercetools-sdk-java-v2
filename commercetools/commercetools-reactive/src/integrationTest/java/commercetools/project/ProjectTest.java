
package commercetools.project;

import com.commercetools.api.models.project.Project;
import com.commercetools.http.reactive.ApiHttpClient;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import reactor.core.publisher.Mono;

public class ProjectTest {
    @Test
    public void byKeyGet() throws Exception {
        ApiHttpClient client = CommercetoolsTestUtils.getClient();

        Project project = Mono.from(client.execute(CommercetoolsTestUtils.getProjectApiRoot().get())).block().getBody();
        Assertions.assertNotNull(project);
        Assertions.assertEquals(CommercetoolsTestUtils.getProjectKey(), project.getKey());
    }

}
