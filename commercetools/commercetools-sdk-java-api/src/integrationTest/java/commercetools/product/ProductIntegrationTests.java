
package commercetools.product;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

public class ProductIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Product product = ProductFixtures.createProduct();
        Assert.assertNotNull(product);

        Product deletedProduct = ProductFixtures.deleteProductById(product.getId(), product.getVersion());
        Assert.assertNotNull(deletedProduct);
    }

    @Test
    public void getById() {
        ProductFixtures.withProduct(product -> {
            Product queriedProduct = CommercetoolsTestUtils.getProjectRoot()
                    .products()
                    .withId(product.getId())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assert.assertNotNull(queriedProduct);
            Assert.assertEquals(product.getId(), queriedProduct.getId());
        });
    }

    @Test
    public void getByKey() {
        ProductFixtures.withProduct(product -> {
            Product queriedProduct = CommercetoolsTestUtils.getProjectRoot()
                    .products()
                    .withKey(product.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assert.assertNotNull(queriedProduct);
            Assert.assertEquals(product.getKey(), queriedProduct.getKey());
        });
    }

    @Test
    public void updateById() {
        ProductFixtures.withUpdateableProduct(product -> {
            List<ProductUpdateAction> updateActions = new ArrayList<>();
            LocalizedString newName = CommercetoolsTestUtils.randomLocalizedString();
            updateActions.add(ProductChangeNameActionBuilder.of().name(newName).build());

            Product updatedProduct = CommercetoolsTestUtils.getProjectRoot()
                    .products()
                    .withId(product.getId())
                    .post(ProductUpdateBuilder.of().actions(updateActions).version(product.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedProduct);

            return updatedProduct;
        });
    }

    @Test
    public void updateByKey() {
        ProductFixtures.withUpdateableProduct(product -> {
            List<ProductUpdateAction> updateActions = new ArrayList<>();
            LocalizedString newName = CommercetoolsTestUtils.randomLocalizedString();
            updateActions.add(ProductChangeNameActionBuilder.of().name(newName).build());

            Product updatedProduct = CommercetoolsTestUtils.getProjectRoot()
                    .products()
                    .withKey(product.getKey())
                    .post(ProductUpdateBuilder.of().actions(updateActions).version(product.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updatedProduct);

            return updatedProduct;
        });
    }

    @Test
    public void query() {
        ProductFixtures.withProduct(product -> {
            ProductPagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot()
                    .products()
                    .get()
                    .withWhere("id=" + "\"" + product.getId() + "\"")
                    .executeBlocking()
                    .getBody();
            Assert.assertEquals(response.getResults().size(), 1);
            Assert.assertEquals(response.getResults().get(0).getId(), product.getId());
        });
    }

    @Test
    public void upload() {
        ProductFixtures.withProduct(product -> {
            File imageFile;
            try {
                imageFile = File.createTempFile("ct_logo_farbe", ".gif");
                imageFile.deleteOnExit();
                byte[] fileBytes = IOUtils.toByteArray(ClassLoader.getSystemResourceAsStream("ct_logo_farbe.gif"));
                FileOutputStream outStream = new FileOutputStream(imageFile);
                outStream.write(fileBytes);
                outStream.close();

            }
            catch (IOException e) {
                imageFile = new File("src/integrationTest/resources/ct_logo_farbe.gif");
            }

            final ByProjectKeyRequestBuilder projectRoot = CommercetoolsTestUtils.getProjectRoot();
            final Product result = projectRoot.products()
                    .withId(product.getId())
                    .images()
                    .post(imageFile)
                    .contentType("image/gif")
                    .withSku(product.getMasterData().getCurrent().getMasterVariant().getSku())
                    .executeBlocking()
                    .getBody();

            Assert.assertSame(1, result.getMasterData().getStaged().getMasterVariant().getImages().size()
                    - product.getMasterData().getStaged().getMasterVariant().getImages().size());
        });
    }
}
