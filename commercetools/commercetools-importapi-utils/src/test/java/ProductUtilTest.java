import com.commercetools.api.models.product.ProductProjection;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Test;

import static com.commercetools.sdk.ProductUtil.toProductDraftImport;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductUtilTest {
    @Test
    void productTransformTest() {
        var testProduct = ProductProjection.builder().key("test").build();
        var transformedProduct = toProductDraftImport(testProduct);
        assertEquals(testProduct.getKey(), transformedProduct.getKey());
    }
}
