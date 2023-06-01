package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.producttypes.AttributeBooleanType;
import com.commercetools.importapi.models.producttypes.AttributeDateTimeType;
import com.commercetools.importapi.models.producttypes.AttributeDateType;
import com.commercetools.importapi.models.producttypes.AttributeEnumType;
import com.commercetools.importapi.models.producttypes.AttributeLocalizableTextType;
import com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumType;
import com.commercetools.importapi.models.producttypes.AttributeMoneyType;
import com.commercetools.importapi.models.producttypes.AttributeNestedType;
import com.commercetools.importapi.models.producttypes.AttributeNumberType;
import com.commercetools.importapi.models.producttypes.AttributeReferenceType;
import com.commercetools.importapi.models.producttypes.AttributeSetType;
import com.commercetools.importapi.models.producttypes.AttributeTextType;
import com.commercetools.importapi.models.producttypes.AttributeTimeType;
import com.commercetools.importapi.models.producttypes.AttributeType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeTypeBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeTypeBuilder {

    public com.commercetools.importapi.models.producttypes.AttributeBooleanTypeBuilder booleanBuilder() {
       return com.commercetools.importapi.models.producttypes.AttributeBooleanTypeBuilder.of();
    }
    public com.commercetools.importapi.models.producttypes.AttributeDateTimeTypeBuilder datetimeBuilder() {
       return com.commercetools.importapi.models.producttypes.AttributeDateTimeTypeBuilder.of();
    }
    public com.commercetools.importapi.models.producttypes.AttributeDateTypeBuilder dateBuilder() {
       return com.commercetools.importapi.models.producttypes.AttributeDateTypeBuilder.of();
    }
    public com.commercetools.importapi.models.producttypes.AttributeEnumTypeBuilder enumBuilder() {
       return com.commercetools.importapi.models.producttypes.AttributeEnumTypeBuilder.of();
    }
    public com.commercetools.importapi.models.producttypes.AttributeLocalizableTextTypeBuilder ltextBuilder() {
       return com.commercetools.importapi.models.producttypes.AttributeLocalizableTextTypeBuilder.of();
    }
    public com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumTypeBuilder lenumBuilder() {
       return com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumTypeBuilder.of();
    }
    public com.commercetools.importapi.models.producttypes.AttributeMoneyTypeBuilder moneyBuilder() {
       return com.commercetools.importapi.models.producttypes.AttributeMoneyTypeBuilder.of();
    }
    public com.commercetools.importapi.models.producttypes.AttributeNestedTypeBuilder nestedBuilder() {
       return com.commercetools.importapi.models.producttypes.AttributeNestedTypeBuilder.of();
    }
    public com.commercetools.importapi.models.producttypes.AttributeNumberTypeBuilder numberBuilder() {
       return com.commercetools.importapi.models.producttypes.AttributeNumberTypeBuilder.of();
    }
    public com.commercetools.importapi.models.producttypes.AttributeReferenceTypeBuilder referenceBuilder() {
       return com.commercetools.importapi.models.producttypes.AttributeReferenceTypeBuilder.of();
    }
    public com.commercetools.importapi.models.producttypes.AttributeSetTypeBuilder setBuilder() {
       return com.commercetools.importapi.models.producttypes.AttributeSetTypeBuilder.of();
    }
    public com.commercetools.importapi.models.producttypes.AttributeTextTypeBuilder textBuilder() {
       return com.commercetools.importapi.models.producttypes.AttributeTextTypeBuilder.of();
    }
    public com.commercetools.importapi.models.producttypes.AttributeTimeTypeBuilder timeBuilder() {
       return com.commercetools.importapi.models.producttypes.AttributeTimeTypeBuilder.of();
    }

    /**
     * factory method for an instance of AttributeTypeBuilder
     * @return builder 
     */
    public static AttributeTypeBuilder of() {
        return new AttributeTypeBuilder();
    }

}
