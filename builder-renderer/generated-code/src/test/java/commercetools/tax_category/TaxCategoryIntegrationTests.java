package commercetools.tax_category;

import com.commercetools.models.TaxCategory.*;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TaxCategoryIntegrationTests {
    
    @Test
    public void createAndDelete() {
        TaxCategoryDraft taxCategoryDraft = TaxCategoryDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .key(CommercetoolsTestUtils.randomKey())
                .build();

        TaxCategory taxCategory = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .taxCategories()
                .post(taxCategoryDraft)
                .executeBlocking();

        Assertions.assertNotNull(taxCategory);
        Assertions.assertEquals(taxCategoryDraft.getName(), taxCategory.getName());
        Assertions.assertEquals(taxCategoryDraft.getKey(), taxCategory.getKey());
        
        TaxCategory deletedTaxCategory = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .taxCategories()
                .withId(taxCategory.getId())
                .delete()
                .addVersion(taxCategory.getVersion())
                .executeBlocking();

        Assertions.assertNotNull(deletedTaxCategory);
        Assertions.assertEquals(deletedTaxCategory.getId(), taxCategory.getId());
    }
    
    @Test
    public void getById() {
        TaxCategoryFixtures.withTaxCategory(taxCategory -> {
            TaxCategory queriedTaxCategory = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .taxCategories()
                    .withId(taxCategory.getId())
                    .get()
                    .executeBlocking();

            Assertions.assertNotNull(queriedTaxCategory);
            Assertions.assertEquals(queriedTaxCategory.getId(), taxCategory.getId());
        });
    }

    @Test
    public void getByKey() {
        TaxCategoryFixtures.withTaxCategory(taxCategory -> {
            TaxCategory queriedTaxCategory = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .taxCategories()
                    .withKey(taxCategory.getKey())
                    .get()
                    .executeBlocking();

            Assertions.assertNotNull(queriedTaxCategory);
            Assertions.assertEquals(queriedTaxCategory.getKey(), taxCategory.getKey());
        });
    }

    @Test
    public void query(){
        TaxCategoryFixtures.withTaxCategory(taxCategory -> {
            TaxCategoryPagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .taxCategories()
                    .get()
                    .addWhere("id=" + "\"" + taxCategory.getId() +"\"")
                    .executeBlocking();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), taxCategory.getId());
        });
    }

    @Test
    public void updateById(){
        TaxCategoryFixtures.withUpdateableTaxCategory(taxCategory -> {

            List<TaxCategoryUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(TaxCategorySetKeyActionBuilder.of().key(newKey).build());
            
            TaxCategory updatedTaxCategory = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .taxCategories()
                    .withId(taxCategory.getId())
                    .post(TaxCategoryUpdateBuilder.of()
                        .actions(updateActions)
                        .version(taxCategory.getVersion())
                        .build())
                    .executeBlocking();

            Assertions.assertNotNull(updatedTaxCategory);
            Assertions.assertEquals(updatedTaxCategory.getKey(), newKey);
            
            return updatedTaxCategory;
        });
    }

    @Test
    public void updateByIKey(){
        TaxCategoryFixtures.withUpdateableTaxCategory(taxCategory -> {

            List<TaxCategoryUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(TaxCategorySetKeyActionBuilder.of().key(newKey).build());

            TaxCategory updatedTaxCategory = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .taxCategories()
                    .withKey(taxCategory.getKey())
                    .post(TaxCategoryUpdateBuilder.of()
                            .actions(updateActions)
                            .version(taxCategory.getVersion())
                            .build())
                    .executeBlocking();

            Assertions.assertNotNull(updatedTaxCategory);
            Assertions.assertEquals(updatedTaxCategory.getKey(), newKey);

            return updatedTaxCategory;
        });
    }
    
}
