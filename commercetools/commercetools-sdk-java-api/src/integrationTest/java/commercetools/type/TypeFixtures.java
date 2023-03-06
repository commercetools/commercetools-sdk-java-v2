
package commercetools.type;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.type.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class TypeFixtures {

    public static void withType(final Consumer<Type> consumer) {
        Type type = createType();
        try {
            consumer.accept(type);
        }
        finally {
            deleteType(type.getId(), type.getVersion());
        }
    }

    public static void withUpdateableType(final UnaryOperator<Type> operator) {
        Type type = createType();
        try {
            type = operator.apply(type);
        }
        finally {
            deleteType(type.getId(), type.getVersion());
        }
    }

    public static Type createType() {
        TypeDraft typeDraft = TypeDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .resourceTypeIds(Arrays.asList(ResourceTypeId.ASSET, ResourceTypeId.CATEGORY, ResourceTypeId.ORDER,
                    ResourceTypeId.CART_DISCOUNT))
                .withFieldDefinitions(
                    fieldDefinitionBuilder -> fieldDefinitionBuilder.type(CustomFieldStringTypeBuilder.of().build())
                            .name("string-field")
                            .label(CommercetoolsTestUtils.randomLocalizedString())
                            .required(false)
                            .inputHint(TypeTextInputHint.SINGLE_LINE))
                .plusFieldDefinitions(fieldDefinitionBuilder -> fieldDefinitionBuilder
                        .type(fieldTypeBuilder -> fieldTypeBuilder.localizedEnumBuilder()
                                .withValues(valueBuilder -> valueBuilder.key("foo")
                                        .label(stringBuilder -> stringBuilder.addValue("en", "foo")))
                                .plusValues(valueBuilder -> valueBuilder.key("bar")
                                        .label(stringBuilder -> stringBuilder.addValue("en", "bar"))))
                        .name("enum-field")
                        .label(CommercetoolsTestUtils.randomLocalizedString())
                        .required(false)
                        .inputHint(TypeTextInputHint.SINGLE_LINE))
                .plusFieldDefinitions(
                    fieldDefinitionBuilder -> fieldDefinitionBuilder.type(FieldTypeBuilder::localizedStringBuilder)
                            .name("localized-field")
                            .label(CommercetoolsTestUtils.randomLocalizedString())
                            .required(false)
                            .inputHint(TypeTextInputHint.SINGLE_LINE))
                .plusFieldDefinitions(fieldDefinitionBuilder -> fieldDefinitionBuilder
                        .type(fieldTypeBuilder -> fieldTypeBuilder.referenceBuilder()
                                .referenceTypeId(CustomFieldReferenceValue.CATEGORY))
                        .name("ref-field")
                        .label(CommercetoolsTestUtils.randomLocalizedString())
                        .required(false)
                        .inputHint(TypeTextInputHint.SINGLE_LINE))
                .build();

        Type type = CommercetoolsTestUtils.getProjectApiRoot().types().post(typeDraft).executeBlocking().getBody();

        Assertions.assertNotNull(type);
        Assertions.assertEquals(type.getKey(), typeDraft.getKey());

        return type;
    }

    public static Type deleteType(final String id, final Long version) {
        Type type = CommercetoolsTestUtils.getProjectApiRoot()
                .types()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(type);
        Assertions.assertEquals(type.getId(), id);

        return type;
    }
}
