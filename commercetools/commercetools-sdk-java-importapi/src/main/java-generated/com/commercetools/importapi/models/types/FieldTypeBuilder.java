package com.commercetools.importapi.models.types;

import com.commercetools.importapi.models.types.CustomFieldBooleanType;
import com.commercetools.importapi.models.types.CustomFieldDateTimeType;
import com.commercetools.importapi.models.types.CustomFieldDateType;
import com.commercetools.importapi.models.types.CustomFieldEnumType;
import com.commercetools.importapi.models.types.CustomFieldLocalizedEnumType;
import com.commercetools.importapi.models.types.CustomFieldLocalizedStringType;
import com.commercetools.importapi.models.types.CustomFieldMoneyType;
import com.commercetools.importapi.models.types.CustomFieldNumberType;
import com.commercetools.importapi.models.types.CustomFieldReferenceType;
import com.commercetools.importapi.models.types.CustomFieldSetType;
import com.commercetools.importapi.models.types.CustomFieldStringType;
import com.commercetools.importapi.models.types.CustomFieldTimeType;
import com.commercetools.importapi.models.types.FieldType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FieldTypeBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class FieldTypeBuilder {

    public com.commercetools.importapi.models.types.CustomFieldBooleanTypeBuilder booleanBuilder() {
       return com.commercetools.importapi.models.types.CustomFieldBooleanTypeBuilder.of();
    }
    public com.commercetools.importapi.models.types.CustomFieldDateTimeTypeBuilder dateTimeBuilder() {
       return com.commercetools.importapi.models.types.CustomFieldDateTimeTypeBuilder.of();
    }
    public com.commercetools.importapi.models.types.CustomFieldDateTypeBuilder dateBuilder() {
       return com.commercetools.importapi.models.types.CustomFieldDateTypeBuilder.of();
    }
    public com.commercetools.importapi.models.types.CustomFieldEnumTypeBuilder enumBuilder() {
       return com.commercetools.importapi.models.types.CustomFieldEnumTypeBuilder.of();
    }
    public com.commercetools.importapi.models.types.CustomFieldLocalizedEnumTypeBuilder localizedEnumBuilder() {
       return com.commercetools.importapi.models.types.CustomFieldLocalizedEnumTypeBuilder.of();
    }
    public com.commercetools.importapi.models.types.CustomFieldLocalizedStringTypeBuilder localizedStringBuilder() {
       return com.commercetools.importapi.models.types.CustomFieldLocalizedStringTypeBuilder.of();
    }
    public com.commercetools.importapi.models.types.CustomFieldMoneyTypeBuilder moneyBuilder() {
       return com.commercetools.importapi.models.types.CustomFieldMoneyTypeBuilder.of();
    }
    public com.commercetools.importapi.models.types.CustomFieldNumberTypeBuilder numberBuilder() {
       return com.commercetools.importapi.models.types.CustomFieldNumberTypeBuilder.of();
    }
    public com.commercetools.importapi.models.types.CustomFieldReferenceTypeBuilder referenceBuilder() {
       return com.commercetools.importapi.models.types.CustomFieldReferenceTypeBuilder.of();
    }
    public com.commercetools.importapi.models.types.CustomFieldSetTypeBuilder setBuilder() {
       return com.commercetools.importapi.models.types.CustomFieldSetTypeBuilder.of();
    }
    public com.commercetools.importapi.models.types.CustomFieldStringTypeBuilder stringBuilder() {
       return com.commercetools.importapi.models.types.CustomFieldStringTypeBuilder.of();
    }
    public com.commercetools.importapi.models.types.CustomFieldTimeTypeBuilder timeBuilder() {
       return com.commercetools.importapi.models.types.CustomFieldTimeTypeBuilder.of();
    }

    /**
     * factory method for an instance of FieldTypeBuilder
     * @return builder 
     */
    public static FieldTypeBuilder of() {
        return new FieldTypeBuilder();
    }

}
