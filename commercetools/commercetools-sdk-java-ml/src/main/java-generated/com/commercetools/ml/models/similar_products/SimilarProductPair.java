package com.commercetools.ml.models.similar_products;

import com.commercetools.ml.models.similar_products.SimilarProduct;
import com.commercetools.ml.models.similar_products.SimilarProductPairImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>A pair of SimilarProducts</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = SimilarProductPairImpl.class)
public interface SimilarProductPair  {

    /**
    *  <p>The probability of product similarity.</p>
    */
    @NotNull
    @JsonProperty("confidence")
    public Double getConfidence();
    
    @NotNull
    @Valid
    @JsonProperty("products")
    public List<SimilarProduct> getProducts();

    public void setConfidence(final Double confidence);
    
    public void setProducts(final List<SimilarProduct> products);

    public static SimilarProductPairImpl of(){
        return new SimilarProductPairImpl();
    }
    

    public static SimilarProductPairImpl of(final SimilarProductPair template) {
        SimilarProductPairImpl instance = new SimilarProductPairImpl();
        instance.setConfidence(template.getConfidence());
        instance.setProducts(template.getProducts());
        return instance;
    }

}
