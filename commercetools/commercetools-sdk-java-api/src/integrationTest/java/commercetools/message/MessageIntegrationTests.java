
package commercetools.message;

import static commercetools.product.ProductFixtures.*;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.MessagePagedQueryResponse;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessageIntegrationTests {

    @Test
    public void query() {
        withProduct(product -> deleteProductById(product.getId(), product.getVersion()));
        MessagePagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                .messages()
                .get()
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(response);
        Assertions.assertFalse(response.getResults().isEmpty());
    }

    @Test
    public void getById() {
        withProduct(product -> deleteProductById(product.getId(), product.getVersion()));

        MessagePagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                .messages()
                .get()
                .executeBlocking()
                .getBody();

        String messageId = response.getResults().get(0).getId();
        Message message = CommercetoolsTestUtils.getProjectApiRoot()
                .messages()
                .withId(messageId)
                .get()
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(message);
        Assertions.assertEquals(message.getId(), messageId);
    }
}
