package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DiscountCodeSetDescriptionActionImpl.class)
public interface DiscountCodeSetDescriptionAction extends DiscountCodeUpdateAction {

    /**
    *  <p>If the <code>description</code> parameter is not included, the field will be emptied.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static DiscountCodeSetDescriptionAction of(){
        return new DiscountCodeSetDescriptionActionImpl();
    }
    

    public static DiscountCodeSetDescriptionAction of(final DiscountCodeSetDescriptionAction template) {
        DiscountCodeSetDescriptionActionImpl instance = new DiscountCodeSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static DiscountCodeSetDescriptionActionBuilder builder(){
        return DiscountCodeSetDescriptionActionBuilder.of();
    }
    
    public static DiscountCodeSetDescriptionActionBuilder builder(final DiscountCodeSetDescriptionAction template){
        return DiscountCodeSetDescriptionActionBuilder.of(template);
    }
    

    default <T> T withDiscountCodeSetDescriptionAction(Function<DiscountCodeSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
