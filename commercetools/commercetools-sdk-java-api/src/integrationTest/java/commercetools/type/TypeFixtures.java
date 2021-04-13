
package commercetools.type;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.type.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

public class TypeFixtures {

    public static void withType(final Consumer<Type> consumer) {
        Type type = createType();
        consumer.accept(type);
        deleteType(type.getId(), type.getVersion());
    }

    public static void withUpdateableType(final UnaryOperator<Type> operator) {
        Type type = createType();
        type = operator.apply(type);
        deleteType(type.getId(), type.getVersion());
    }

    public static Type createType() {
        TypeDraft typeDraft = TypeDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .resourceTypeIds(Arrays.asList(ResourceTypeId.ASSET))
                .fieldDefinitions(Arrays.asList(FieldDefinitionBuilder.of()
                        .type(CustomFieldStringTypeBuilder.of().build())
                        .name(CommercetoolsTestUtils.randomString())
                        .label(CommercetoolsTestUtils.randomLocalizedString())
                        .required(false)
                        .inputHint(TypeTextInputHint.SINGLE_LINE)
                        .build()))
                .build();

        Type type = CommercetoolsTestUtils.getProjectRoot().types().post(typeDraft).executeBlocking().getBody();

        Assert.assertNotNull(type);
        Assert.assertEquals(type.getKey(), typeDraft.getKey());

        return type;
    }

    public static Type deleteType(final String id, final Long version) {
        Type type = CommercetoolsTestUtils.getProjectRoot()
                .types()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(type);
        Assert.assertEquals(type.getId(), id);

        return type;
    }

}
