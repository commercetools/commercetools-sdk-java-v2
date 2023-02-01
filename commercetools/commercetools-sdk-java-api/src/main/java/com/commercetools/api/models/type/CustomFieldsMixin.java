
package com.commercetools.api.models.type;

public interface CustomFieldsMixin {
    public TypeReference getType();

    public FieldContainer getFields();

    public default CustomFieldsDraft toDraft() {
        return toDraftBuilder().build();
    }

    public default CustomFieldsDraftBuilder toDraftBuilder() {
        return CustomFieldsDraft.builder().type(getType().toResourceIdentifier()).fields(getFields());
    }

}
