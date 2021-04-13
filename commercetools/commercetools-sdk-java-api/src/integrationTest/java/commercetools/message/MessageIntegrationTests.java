
package commercetools.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.MessagePagedQueryResponse;
import com.commercetools.api.models.product.Product;
import commercetools.product.ProductFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class MessageIntegrationTests {

    @Test
    public void query() {
        Product product = ProductFixtures.createProduct();
        ProductFixtures.deleteProductById(product.getId(), product.getVersion());

        MessagePagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot()
                .messages()
                .get()
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(response);
        Assert.assertFalse(response.getResults().isEmpty());
    }

    @Test
    public void getById() {
        Product product = ProductFixtures.createProduct();
        ProductFixtures.deleteProductById(product.getId(), product.getVersion());

        MessagePagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot()
                .messages()
                .get()
                .executeBlocking()
                .getBody();

        String messageId = response.getResults().get(0).getId();
        Message message = CommercetoolsTestUtils.getProjectRoot()
                .messages()
                .withId(messageId)
                .get()
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(message);
        Assert.assertEquals(message.getId(), messageId);
    }
}
