package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.BooleanAttribute;
import com.commercetools.importapi.models.productvariants.BooleanSetAttribute;
import com.commercetools.importapi.models.productvariants.DateAttribute;
import com.commercetools.importapi.models.productvariants.DateSetAttribute;
import com.commercetools.importapi.models.productvariants.DateTimeAttribute;
import com.commercetools.importapi.models.productvariants.DateTimeSetAttribute;
import com.commercetools.importapi.models.productvariants.EnumAttribute;
import com.commercetools.importapi.models.productvariants.EnumSetAttribute;
import com.commercetools.importapi.models.productvariants.LocalizableEnumAttribute;
import com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttribute;
import com.commercetools.importapi.models.productvariants.LocalizableTextAttribute;
import com.commercetools.importapi.models.productvariants.LocalizableTextSetAttribute;
import com.commercetools.importapi.models.productvariants.MoneyAttribute;
import com.commercetools.importapi.models.productvariants.MoneySetAttribute;
import com.commercetools.importapi.models.productvariants.NumberAttribute;
import com.commercetools.importapi.models.productvariants.NumberSetAttribute;
import com.commercetools.importapi.models.productvariants.ReferenceAttribute;
import com.commercetools.importapi.models.productvariants.ReferenceSetAttribute;
import com.commercetools.importapi.models.productvariants.TextAttribute;
import com.commercetools.importapi.models.productvariants.TextSetAttribute;
import com.commercetools.importapi.models.productvariants.TimeAttribute;
import com.commercetools.importapi.models.productvariants.TimeSetAttribute;
import com.commercetools.importapi.models.productvariants.Attribute;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeBuilder {

    public com.commercetools.importapi.models.productvariants.BooleanAttributeBuilder booleanBuilder() {
       return com.commercetools.importapi.models.productvariants.BooleanAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.BooleanSetAttributeBuilder booleanSetBuilder() {
       return com.commercetools.importapi.models.productvariants.BooleanSetAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.DateAttributeBuilder dateBuilder() {
       return com.commercetools.importapi.models.productvariants.DateAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.DateSetAttributeBuilder dateSetBuilder() {
       return com.commercetools.importapi.models.productvariants.DateSetAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.DateTimeAttributeBuilder datetimeBuilder() {
       return com.commercetools.importapi.models.productvariants.DateTimeAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.DateTimeSetAttributeBuilder datetimeSetBuilder() {
       return com.commercetools.importapi.models.productvariants.DateTimeSetAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.EnumAttributeBuilder enumBuilder() {
       return com.commercetools.importapi.models.productvariants.EnumAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.EnumSetAttributeBuilder enumSetBuilder() {
       return com.commercetools.importapi.models.productvariants.EnumSetAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.LocalizableEnumAttributeBuilder lenumBuilder() {
       return com.commercetools.importapi.models.productvariants.LocalizableEnumAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttributeBuilder lenumSetBuilder() {
       return com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.LocalizableTextAttributeBuilder ltextBuilder() {
       return com.commercetools.importapi.models.productvariants.LocalizableTextAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.LocalizableTextSetAttributeBuilder ltextSetBuilder() {
       return com.commercetools.importapi.models.productvariants.LocalizableTextSetAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.MoneyAttributeBuilder moneyBuilder() {
       return com.commercetools.importapi.models.productvariants.MoneyAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.MoneySetAttributeBuilder moneySetBuilder() {
       return com.commercetools.importapi.models.productvariants.MoneySetAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.NumberAttributeBuilder numberBuilder() {
       return com.commercetools.importapi.models.productvariants.NumberAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.NumberSetAttributeBuilder numberSetBuilder() {
       return com.commercetools.importapi.models.productvariants.NumberSetAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.ReferenceAttributeBuilder referenceBuilder() {
       return com.commercetools.importapi.models.productvariants.ReferenceAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.ReferenceSetAttributeBuilder referenceSetBuilder() {
       return com.commercetools.importapi.models.productvariants.ReferenceSetAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.TextAttributeBuilder textBuilder() {
       return com.commercetools.importapi.models.productvariants.TextAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.TextSetAttributeBuilder textSetBuilder() {
       return com.commercetools.importapi.models.productvariants.TextSetAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.TimeAttributeBuilder timeBuilder() {
       return com.commercetools.importapi.models.productvariants.TimeAttributeBuilder.of();
    }
    public com.commercetools.importapi.models.productvariants.TimeSetAttributeBuilder timeSetBuilder() {
       return com.commercetools.importapi.models.productvariants.TimeSetAttributeBuilder.of();
    }

    /**
     * factory method for an instance of AttributeBuilder
     * @return builder 
     */
    public static AttributeBuilder of() {
        return new AttributeBuilder();
    }

}
