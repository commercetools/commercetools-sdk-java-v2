
package com.commercetools;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.UUID;

import com.commercetools.api.models.type.*;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Manual measurement, not a CI check. Run from the IDE.")
public class CustomFieldsPerformanceTest {

    private static final int WARMUP = 20_000;

    private static final int RUNS = 50_000;

    @Test
    public void measure() {
        report("20 money + 20 reference + 20 text", payload(20, true, true, true));
        report("60 money", payload(60, true, false, false));
        report("60 reference", payload(60, false, true, false));
        report("60 text (control)", payload(60, false, false, true));
    }

    private static void report(final String label, final String json) {
        final ThreadMXBean threads = ManagementFactory.getThreadMXBean();

        for (int i = 0; i < WARMUP; i++) {
            JsonUtils.fromJsonString(json, CustomFields.class);
        }

        final long start = threads.getCurrentThreadCpuTime();
        for (int i = 0; i < RUNS; i++) {
            JsonUtils.fromJsonString(json, CustomFields.class);
        }
        final long elapsed = threads.getCurrentThreadCpuTime() - start;

        System.out.printf("%-36s %8.1f µs CPU per decode%n", label, elapsed / 1000.0 / RUNS);
    }

    private static String payload(final int count, final boolean withMoney, final boolean withReference,
            final boolean withText) {
        final StringBuilder fields = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (withMoney) {
                append(fields, "\"money" + i + "\":{\"type\":\"centPrecision\",\"currencyCode\":\"EUR\""
                        + ",\"centAmount\":" + i + ",\"fractionDigits\":2}");
            }
            if (withReference) {
                append(fields, "\"ref" + i + "\":{\"typeId\":\"channel\",\"id\":\"" + UUID.randomUUID() + "\"}");
            }
            if (withText) {
                append(fields, "\"text" + i + "\":\"value " + i + "\"");
            }
        }
        return "{\"type\":{\"typeId\":\"type\",\"id\":\"a0b1c2d3-0000-0000-0000-000000000000\"}" + ",\"fields\":{"
                + fields + "}}";
    }

    private static void append(final StringBuilder sb, final String field) {
        if (!sb.isEmpty()) {
            sb.append(',');
        }
        sb.append(field);
    }
}
