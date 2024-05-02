
package example;

import java.util.Arrays;
import java.util.List;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.*;

public class CreateCategoryWithTypeDemo {
    public Type create(ProjectApiRoot apiRoot) {
        final LocalizedString name = LocalizedString.ofEnglish("type for standard categories");
        final String key = "category-customtype-key";
        //this enables the type only to be used for categories

        final List<FieldDefinition> fieldDefinitions = Arrays.asList(stateFieldDefinition(), imageUrlFieldDefinition(),
            relatedCategoriesFieldDefinition());

        return apiRoot.types()
                .create(draft -> draft.key(key)
                        .name(name)
                        .resourceTypeIds(ResourceTypeId.CATEGORY)
                        .fieldDefinitions(fieldDefinitions))
                .executeBlocking()
                .getBody();
    }

    private static FieldDefinition stateFieldDefinition() {
        final List<CustomFieldEnumValue> values = Arrays.asList(
            CustomFieldEnumValue.builder().key("published").label("the category is publicly visible").build(),
            CustomFieldEnumValue.builder()
                    .key("draft")
                    .label("the category should not be displayed in the frontend")
                    .build());
        final boolean required = false;
        final LocalizedString label = LocalizedString.ofEnglish("state of the category concerning to show it publicly");
        final String fieldName = "state";
        return FieldDefinition.builder()
                .label(label)
                .name(fieldName)
                .required(required)
                .type(CustomFieldEnumType.builder().values(values).build())
                .build();
    }

    private static FieldDefinition imageUrlFieldDefinition() {
        final LocalizedString imageUrlLabel = LocalizedString
                .ofEnglish("absolute url to an image to display for the category");
        return FieldDefinition.builder()
                .label(imageUrlLabel)
                .name("imageUrl")
                .required(false)
                .inputHint(TypeTextInputHint.SINGLE_LINE)
                .build();
    }

    private static FieldDefinition relatedCategoriesFieldDefinition() {
        final LocalizedString relatedCategoriesLabel = LocalizedString
                .ofEnglish("categories to suggest products similar to the current category");
        //referenceTypeId is required to refer to categories
        final CustomFieldSetType setType = CustomFieldSetType.builder()
                .elementType(
                    CustomFieldReferenceType.builder().referenceTypeId(CustomFieldReferenceValue.CATEGORY).build())
                .build();
        return FieldDefinition.builder()
                .label(relatedCategoriesLabel)
                .name("relatedCategories")
                .required(false)
                .type(setType)
                .build();
    }
}
