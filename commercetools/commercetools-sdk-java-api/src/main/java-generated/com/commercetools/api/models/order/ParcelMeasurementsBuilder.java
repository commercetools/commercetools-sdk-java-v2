package com.commercetools.api.models.order;


import com.commercetools.api.models.order.ParcelMeasurements;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelMeasurementsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelMeasurements parcelMeasurements = ParcelMeasurements.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ParcelMeasurementsBuilder implements Builder<ParcelMeasurements> {

    
    @Nullable
    private Integer heightInMillimeter;
    
    
    @Nullable
    private Integer lengthInMillimeter;
    
    
    @Nullable
    private Integer widthInMillimeter;
    
    
    @Nullable
    private Integer weightInGram;

    
    /**
     * set the value to the heightInMillimeter
     * @param heightInMillimeter value to be set
     * @return Builder
     */
    
    public ParcelMeasurementsBuilder heightInMillimeter(@Nullable final Integer heightInMillimeter) {
        this.heightInMillimeter = heightInMillimeter;
        return this;
    }
    
    
    
    
    /**
     * set the value to the lengthInMillimeter
     * @param lengthInMillimeter value to be set
     * @return Builder
     */
    
    public ParcelMeasurementsBuilder lengthInMillimeter(@Nullable final Integer lengthInMillimeter) {
        this.lengthInMillimeter = lengthInMillimeter;
        return this;
    }
    
    
    
    
    /**
     * set the value to the widthInMillimeter
     * @param widthInMillimeter value to be set
     * @return Builder
     */
    
    public ParcelMeasurementsBuilder widthInMillimeter(@Nullable final Integer widthInMillimeter) {
        this.widthInMillimeter = widthInMillimeter;
        return this;
    }
    
    
    
    
    /**
     * set the value to the weightInGram
     * @param weightInGram value to be set
     * @return Builder
     */
    
    public ParcelMeasurementsBuilder weightInGram(@Nullable final Integer weightInGram) {
        this.weightInGram = weightInGram;
        return this;
    }
    
    

    /**
     * value of heightInMillimeter}
     * @return heightInMillimeter
     */
    
    @Nullable
    public Integer getHeightInMillimeter(){
        return this.heightInMillimeter;
    }
    
    /**
     * value of lengthInMillimeter}
     * @return lengthInMillimeter
     */
    
    @Nullable
    public Integer getLengthInMillimeter(){
        return this.lengthInMillimeter;
    }
    
    /**
     * value of widthInMillimeter}
     * @return widthInMillimeter
     */
    
    @Nullable
    public Integer getWidthInMillimeter(){
        return this.widthInMillimeter;
    }
    
    /**
     * value of weightInGram}
     * @return weightInGram
     */
    
    @Nullable
    public Integer getWeightInGram(){
        return this.weightInGram;
    }

    /**
     * builds ParcelMeasurements with checking for non-null required values
     * @return ParcelMeasurements
     */
    public ParcelMeasurements build() {
        return new ParcelMeasurementsImpl(heightInMillimeter, lengthInMillimeter, widthInMillimeter, weightInGram);
    }
    
    /**
     * builds ParcelMeasurements without checking for non-null required values
     * @return ParcelMeasurements
     */
    public ParcelMeasurements buildUnchecked() {
        return new ParcelMeasurementsImpl(heightInMillimeter, lengthInMillimeter, widthInMillimeter, weightInGram);
    }

    /**
     * factory method for an instance of ParcelMeasurementsBuilder
     * @return builder 
     */
    public static ParcelMeasurementsBuilder of() {
        return new ParcelMeasurementsBuilder();
    }

    /**
     * create builder for ParcelMeasurements instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelMeasurementsBuilder of(final ParcelMeasurements template) {
        ParcelMeasurementsBuilder builder = new ParcelMeasurementsBuilder();
        builder.heightInMillimeter = template.getHeightInMillimeter();
        builder.lengthInMillimeter = template.getLengthInMillimeter();
        builder.widthInMillimeter = template.getWidthInMillimeter();
        builder.weightInGram = template.getWeightInGram();
        return builder;
    }

}
