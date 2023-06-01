package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeBooleanType;
import com.commercetools.api.models.product_type.AttributeDateTimeType;
import com.commercetools.api.models.product_type.AttributeDateType;
import com.commercetools.api.models.product_type.AttributeEnumType;
import com.commercetools.api.models.product_type.AttributeLocalizableTextType;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumType;
import com.commercetools.api.models.product_type.AttributeMoneyType;
import com.commercetools.api.models.product_type.AttributeNestedType;
import com.commercetools.api.models.product_type.AttributeNumberType;
import com.commercetools.api.models.product_type.AttributeReferenceType;
import com.commercetools.api.models.product_type.AttributeSetType;
import com.commercetools.api.models.product_type.AttributeTextType;
import com.commercetools.api.models.product_type.AttributeTimeType;
import com.commercetools.api.models.product_type.AttributeType;
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

    public com.commercetools.api.models.product_type.AttributeBooleanTypeBuilder booleanBuilder() {
       return com.commercetools.api.models.product_type.AttributeBooleanTypeBuilder.of();
    }
    public com.commercetools.api.models.product_type.AttributeDateTimeTypeBuilder datetimeBuilder() {
       return com.commercetools.api.models.product_type.AttributeDateTimeTypeBuilder.of();
    }
    public com.commercetools.api.models.product_type.AttributeDateTypeBuilder dateBuilder() {
       return com.commercetools.api.models.product_type.AttributeDateTypeBuilder.of();
    }
    public com.commercetools.api.models.product_type.AttributeEnumTypeBuilder enumBuilder() {
       return com.commercetools.api.models.product_type.AttributeEnumTypeBuilder.of();
    }
    public com.commercetools.api.models.product_type.AttributeLocalizableTextTypeBuilder ltextBuilder() {
       return com.commercetools.api.models.product_type.AttributeLocalizableTextTypeBuilder.of();
    }
    public com.commercetools.api.models.product_type.AttributeLocalizedEnumTypeBuilder lenumBuilder() {
       return com.commercetools.api.models.product_type.AttributeLocalizedEnumTypeBuilder.of();
    }
    public com.commercetools.api.models.product_type.AttributeMoneyTypeBuilder moneyBuilder() {
       return com.commercetools.api.models.product_type.AttributeMoneyTypeBuilder.of();
    }
    public com.commercetools.api.models.product_type.AttributeNestedTypeBuilder nestedBuilder() {
       return com.commercetools.api.models.product_type.AttributeNestedTypeBuilder.of();
    }
    public com.commercetools.api.models.product_type.AttributeNumberTypeBuilder numberBuilder() {
       return com.commercetools.api.models.product_type.AttributeNumberTypeBuilder.of();
    }
    public com.commercetools.api.models.product_type.AttributeReferenceTypeBuilder referenceBuilder() {
       return com.commercetools.api.models.product_type.AttributeReferenceTypeBuilder.of();
    }
    public com.commercetools.api.models.product_type.AttributeSetTypeBuilder setBuilder() {
       return com.commercetools.api.models.product_type.AttributeSetTypeBuilder.of();
    }
    public com.commercetools.api.models.product_type.AttributeTextTypeBuilder textBuilder() {
       return com.commercetools.api.models.product_type.AttributeTextTypeBuilder.of();
    }
    public com.commercetools.api.models.product_type.AttributeTimeTypeBuilder timeBuilder() {
       return com.commercetools.api.models.product_type.AttributeTimeTypeBuilder.of();
    }

    /**
     * factory method for an instance of AttributeTypeBuilder
     * @return builder 
     */
    public static AttributeTypeBuilder of() {
        return new AttributeTypeBuilder();
    }

}
