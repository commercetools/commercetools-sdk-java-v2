
package commercetools.utils;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.Money;

import org.apache.commons.io.IOUtils;

public class TestUtils {
    public static final Money EURO_30 = CentPrecisionMoney.builder()
            .currencyCode("EUR")
            .centAmount(3000L)
            .fractionDigits(2)
            .build();
    public static final Money EURO_20 = CentPrecisionMoney.builder()
            .currencyCode("EUR")
            .centAmount(2000L)
            .fractionDigits(2)
            .build();

    public static String stringFromResource(final String resourcePath) {
        try {
            return IOUtils.toString(
                Objects.requireNonNull(
                    Thread.currentThread().getContextClassLoader().getResourceAsStream(resourcePath)),
                StandardCharsets.UTF_8);
        }
        catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
