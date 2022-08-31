
package commercetools.type;

import static commercetools.type.TypeFixtures.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryUpdate;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.*;
import commercetools.category.CategoryFixtures;
import commercetools.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypeIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Type type = createType();
        Type deletedType = deleteType(type.getId(), type.getVersion());

        Assertions.assertEquals(type.getId(), deletedType.getId());
    }

    @Test
    public void getById() {
        withType(type -> {
            Type queriedType = CommercetoolsTestUtils.getProjectApiRoot()
                    .types()
                    .withId(type.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedType);
            Assertions.assertEquals(type.getId(), queriedType.getId());
        });
    }

    @Test
    public void getByKey() {
        withType(type -> {
            Type queriedType = CommercetoolsTestUtils.getProjectApiRoot()
                    .types()
                    .withKey(type.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedType);
            Assertions.assertEquals(type.getId(), queriedType.getId());
        });
    }

    @Test
    public void query() {
        withType(type -> {
            TypePagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .types()
                    .get()
                    .withWhere("id=" + "\"" + type.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), type.getId());
        });
    }

    @Test
    public void updateById() {
        withUpdateableType(type -> {
            List<TypeUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(TypeChangeKeyActionBuilder.of().key(newKey).build());

            Type updatedType = CommercetoolsTestUtils.getProjectApiRoot()
                    .types()
                    .withId(type.getId())
                    .post(TypeUpdateBuilder.of().actions(updateActions).version(type.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedType);
            Assertions.assertEquals(updatedType.getKey(), newKey);

            return updatedType;
        });
    }

    @Test
    public void updateByKey() {
        withUpdateableType(type -> {
            List<TypeUpdateAction> updateActions = new ArrayList<>();
            String newKey = CommercetoolsTestUtils.randomKey();
            updateActions.add(TypeChangeKeyActionBuilder.of().key(newKey).build());

            Type updatedType = CommercetoolsTestUtils.getProjectApiRoot()
                    .types()
                    .withKey(type.getKey())
                    .post(TypeUpdateBuilder.of().actions(updateActions).version(type.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updatedType);
            Assertions.assertEquals(updatedType.getKey(), newKey);

            return updatedType;
        });
    }

    @Test
    public void deleteByKey() {
        Type type = createType();
        Type deletedType = CommercetoolsTestUtils.getProjectApiRoot()
                .types()
                .withKey(type.getKey())
                .delete()
                .withVersion(type.getVersion())
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(deletedType);
        Assertions.assertEquals(type.getId(), deletedType.getId());
    }

    @Test
    public void customLabelDeserializer() {
        ProjectApiRoot apiRoot = CommercetoolsTestUtils.getProjectApiRoot();
        withType(type -> {
            CategoryFixtures.withUpdateableCategory(category -> {
                final ApiHttpResponse<Category> result = apiRoot.categories()
                        .withId(category.getId())
                        .post(
                            CategoryUpdate.builder()
                                    .version(category.getVersion())
                                    .withActions(actionBuilder -> actionBuilder.setCustomTypeBuilder()
                                            .type(typeBuilder -> typeBuilder.id(type.getId()))
                                            .fields(fieldContainerBuilder -> fieldContainerBuilder
                                                    .addValue("enum-field", "foo")
                                                    .addValue("localized-field",
                                                        LocalizedString.of(Locale.forLanguageTag("key"), "test"))))
                                    .build())
                        .executeBlocking();
                Category updated = result.getBody();
                Assertions.assertEquals("foo",
                    updated.getCustom().withCustomFields(CustomFieldsAccessor::new).asString("enum-field"));
                Assertions.assertEquals("test",
                    updated.getCustom()
                            .withCustomFields(CustomFieldsAccessor::new)
                            .asLocalizedString("localized-field")
                            .get("key"));
                return updated;
            });
        });
    }

}
