package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionAction;
import com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueAction;
import com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameAction;
import com.commercetools.api.models.product_type.ProductTypeChangeDescriptionAction;
import com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyAction;
import com.commercetools.api.models.product_type.ProductTypeChangeInputHintAction;
import com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLabelAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderAction;
import com.commercetools.api.models.product_type.ProductTypeChangeNameAction;
import com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelAction;
import com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderAction;
import com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionAction;
import com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesAction;
import com.commercetools.api.models.product_type.ProductTypeSetInputTipAction;
import com.commercetools.api.models.product_type.ProductTypeSetKeyAction;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeUpdateActionBuilder {

    public com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionActionBuilder addAttributeDefinitionBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueActionBuilder addLocalizedEnumValueBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueActionBuilder addPlainEnumValueBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintActionBuilder changeAttributeConstraintBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameActionBuilder changeAttributeNameBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameActionBuilder changeAttributeOrderByNameBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeChangeDescriptionActionBuilder changeDescriptionBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeDescriptionActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyActionBuilder changeEnumKeyBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeChangeInputHintActionBuilder changeInputHintBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeInputHintActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableActionBuilder changeIsSearchableBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeChangeLabelActionBuilder changeLabelBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeLabelActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelActionBuilder changeLocalizedEnumValueLabelBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderActionBuilder changeLocalizedEnumValueOrderBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeChangeNameActionBuilder changeNameBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangeNameActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelActionBuilder changePlainEnumValueLabelBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderActionBuilder changePlainEnumValueOrderBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionActionBuilder removeAttributeDefinitionBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesActionBuilder removeEnumValuesBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeSetInputTipActionBuilder setInputTipBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeSetInputTipActionBuilder.of();
    }
    public com.commercetools.api.models.product_type.ProductTypeSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.product_type.ProductTypeSetKeyActionBuilder.of();
    }

    /**
     * factory method for an instance of ProductTypeUpdateActionBuilder
     * @return builder 
     */
    public static ProductTypeUpdateActionBuilder of() {
        return new ProductTypeUpdateActionBuilder();
    }

}
