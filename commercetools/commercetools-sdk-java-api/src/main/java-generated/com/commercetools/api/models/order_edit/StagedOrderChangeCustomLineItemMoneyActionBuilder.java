package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeCustomLineItemMoneyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeCustomLineItemMoneyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeCustomLineItemMoneyAction stagedOrderChangeCustomLineItemMoneyAction = StagedOrderChangeCustomLineItemMoneyAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .money(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderChangeCustomLineItemMoneyActionBuilder implements Builder<StagedOrderChangeCustomLineItemMoneyAction> {

    
    
    private String customLineItemId;
    
    
    
    private com.commercetools.api.models.common.Money money;

    
    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */
    
    public StagedOrderChangeCustomLineItemMoneyActionBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public StagedOrderChangeCustomLineItemMoneyActionBuilder money(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public StagedOrderChangeCustomLineItemMoneyActionBuilder withMoney(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     * @param money value to be set
     * @return Builder
     */
    
    public StagedOrderChangeCustomLineItemMoneyActionBuilder money( final com.commercetools.api.models.common.Money money) {
        this.money = money;
        return this;
    }
    
    

    /**
     * value of customLineItemId}
     * @return customLineItemId
     */
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     * @return money
     */
    
    
    public com.commercetools.api.models.common.Money getMoney(){
        return this.money;
    }

    /**
     * builds StagedOrderChangeCustomLineItemMoneyAction with checking for non-null required values
     * @return StagedOrderChangeCustomLineItemMoneyAction
     */
    public StagedOrderChangeCustomLineItemMoneyAction build() {
        Objects.requireNonNull(customLineItemId, StagedOrderChangeCustomLineItemMoneyAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(money, StagedOrderChangeCustomLineItemMoneyAction.class + ": money is missing");
        return new StagedOrderChangeCustomLineItemMoneyActionImpl(customLineItemId, money);
    }
    
    /**
     * builds StagedOrderChangeCustomLineItemMoneyAction without checking for non-null required values
     * @return StagedOrderChangeCustomLineItemMoneyAction
     */
    public StagedOrderChangeCustomLineItemMoneyAction buildUnchecked() {
        return new StagedOrderChangeCustomLineItemMoneyActionImpl(customLineItemId, money);
    }

    /**
     * factory method for an instance of StagedOrderChangeCustomLineItemMoneyActionBuilder
     * @return builder 
     */
    public static StagedOrderChangeCustomLineItemMoneyActionBuilder of() {
        return new StagedOrderChangeCustomLineItemMoneyActionBuilder();
    }

    /**
     * create builder for StagedOrderChangeCustomLineItemMoneyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeCustomLineItemMoneyActionBuilder of(final StagedOrderChangeCustomLineItemMoneyAction template) {
        StagedOrderChangeCustomLineItemMoneyActionBuilder builder = new StagedOrderChangeCustomLineItemMoneyActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.money = template.getMoney();
        return builder;
    }

}
