
package commercetools.product;

import static commercetools.category.CategoryFixtures.*;
import static commercetools.product.ProductFixtures.*;
import static commercetools.product_type.ProductTypeFixtures.*;
import static commercetools.tax_category.TaxCategoryFixtures.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductIntegrationTests {

    @Test
    public void createAndDeleteById() {
        withTaxCategory(
            taxCategory -> withCategory(category -> withProductType(createProductTypeDraft(), productType -> {
                Product product = createProduct(productType, category, taxCategory);
                Assertions.assertNotNull(product);

                Product deletedProduct = deleteProductById(product.getId(), product.getVersion());
                Assertions.assertNotNull(deletedProduct);
            })));
    }

    @Test
    public void getById() {
        withProduct(product -> {
            Product queriedProduct = CommercetoolsTestUtils.getProjectApiRoot()
                    .products()
                    .withId(product.getId())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assertions.assertNotNull(queriedProduct);
            Assertions.assertEquals(product.getId(), queriedProduct.getId());
        });
    }

    @Test
    public void getByKey() {
        withProduct(product -> {
            Product queriedProduct = CommercetoolsTestUtils.getProjectApiRoot()
                    .products()
                    .withKey(product.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();
            Assertions.assertNotNull(queriedProduct);
            Assertions.assertEquals(product.getKey(), queriedProduct.getKey());
        });
    }

    @Test
    public void updateById() {
        withUpdateableProduct(product -> {
            List<ProductUpdateAction> updateActions = new ArrayList<>();
            LocalizedString newName = CommercetoolsTestUtils.randomLocalizedString();
            updateActions.add(ProductChangeNameActionBuilder.of().name(newName).build());

            Product updatedProduct = CommercetoolsTestUtils.getProjectApiRoot()
                    .products()
                    .withId(product.getId())
                    .post(ProductUpdateBuilder.of().actions(updateActions).version(product.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedProduct);

            return updatedProduct;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableProduct(product -> {
            List<ProductUpdateAction> updateActions = new ArrayList<>();
            LocalizedString newName = CommercetoolsTestUtils.randomLocalizedString();
            updateActions.add(ProductChangeNameActionBuilder.of().name(newName).build());

            Product updatedProduct = CommercetoolsTestUtils.getProjectApiRoot()
                    .products()
                    .withKey(product.getKey())
                    .post(ProductUpdateBuilder.of().actions(updateActions).version(product.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedProduct);

            return updatedProduct;
        });
    }

    @Test
    public void query() {
        withProduct(product -> {
            ProductPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .products()
                    .get()
                    .withWhere("id=" + "\"" + product.getId() + "\"")
                    .executeBlocking()
                    .getBody();
            Assertions.assertEquals(response.getResults().size(), 1);
            Assertions.assertEquals(response.getResults().get(0).getId(), product.getId());
        });
    }

    @Test
    public void upload() {
        withProduct(product -> {
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

            final ProjectApiRoot projectRoot = CommercetoolsTestUtils.getProjectApiRoot();
            final Product result = projectRoot.products()
                    .withId(product.getId())
                    .images()
                    .post(imageFile)
                    .contentType("image/gif")
                    .withSku(product.getMasterData().getCurrent().getMasterVariant().getSku())
                    .executeBlocking()
                    .getBody();

            Assertions.assertSame(1, result.getMasterData().getStaged().getMasterVariant().getImages().size()
                    - product.getMasterData().getStaged().getMasterVariant().getImages().size());
        });
    }
}
