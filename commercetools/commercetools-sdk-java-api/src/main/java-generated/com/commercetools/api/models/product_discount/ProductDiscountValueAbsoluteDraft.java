package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.product_discount.ProductDiscountValueDraft;
import com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductDiscountValueAbsoluteDraftImpl.class)
public interface ProductDiscountValueAbsoluteDraft extends ProductDiscountValueDraft {

    
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<Money> getMoney();

    public void setMoney(final List<Money> money);

    public static ProductDiscountValueAbsoluteDraftImpl of(){
        return new ProductDiscountValueAbsoluteDraftImpl();
    }
    

    public static ProductDiscountValueAbsoluteDraftImpl of(final ProductDiscountValueAbsoluteDraft template) {
        ProductDiscountValueAbsoluteDraftImpl instance = new ProductDiscountValueAbsoluteDraftImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    default <T extends Accessor<ProductDiscountValueAbsoluteDraft>> T withProductDiscountValueAbsoluteDraft(Function<ProductDiscountValueAbsoluteDraft, T> helper) {
        return helper.apply(this);
    }
}
