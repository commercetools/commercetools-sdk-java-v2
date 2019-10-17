package commercetools.message;

import com.commercetools.api.generated.models.product.Product;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.message.MessagePagedQueryResponse;
import commercetools.product.ProductFixtures;
import commercetools.product_type.ProductTypeFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;
import org.junit.Test;

public class MessageIntegrationTests {
    
    @Test
    public void query(){
        Product product = ProductFixtures.createProduct(ProductTypeFixtures.createProductType());
        ProductFixtures.deleteProductById(product.getId(), product.getVersion());
        
        MessagePagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .messages()
                .get()
                .executeBlocking().getBody();

        Assert.assertNotNull(response);
        Assert.assertFalse(response.getResults().isEmpty());
    }    
    
    @Test
    public void getById() {
        Product product = ProductFixtures.createProduct(ProductTypeFixtures.createProductType());
        ProductFixtures.deleteProductById(product.getId(), product.getVersion());

        MessagePagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .messages()
                .get()
                .executeBlocking().getBody();
        
        String messageId = response.getResults().get(0).getId();
        Message message = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .messages()
                .withId(messageId)
                .get()
                .executeBlocking().getBody();

        Assert.assertNotNull(message);
        Assert.assertEquals(message.getId(), messageId);
    }
}
