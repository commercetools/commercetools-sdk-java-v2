package commercetools.message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Message.MessagePagedQueryResponse;
import com.commercetools.models.Product.Product;
import commercetools.product.ProductFixtures;
import commercetools.product_type.ProductTypeFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessageIntegrationTests {
    
    @Test
    public void query(){
        Product product = ProductFixtures.createProduct(ProductTypeFixtures.createProductType());
        ProductFixtures.deleteProductById(product.getId(), product.getVersion());
        
        MessagePagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .messages()
                .get()
                .executeBlocking();

        Assertions.assertNotNull(response);
        Assertions.assertFalse(response.getResults().isEmpty());
    }    
    
    @Test
    public void getById() {
        Product product = ProductFixtures.createProduct(ProductTypeFixtures.createProductType());
        ProductFixtures.deleteProductById(product.getId(), product.getVersion());

        MessagePagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .messages()
                .get()
                .executeBlocking();
        
        String messageId = response.getResults().get(0).getId();
        Message message = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .messages()
                .withId(messageId)
                .get()
                .executeBlocking();

        Assertions.assertNotNull(message);
        Assertions.assertEquals(message.getId(), messageId);
    }
}
