
package io.vrap.rmf.base.client;

import java.util.*;

//for architecture see https://docs.oracle.com/javase/tutorial/ext/basics/spi.html
final class SolutionInfoService {
    private static SolutionInfoService instance;

    private SolutionInfoService() {

    }

    public static synchronized SolutionInfoService getInstance() {
        if (instance == null) {
            instance = new SolutionInfoService();
        }
        return instance;
    }

    public List<SolutionInfo> getSolutionInfos() {
        List<SolutionInfo> solutions = new ArrayList<>();
        final ServiceLoader<SolutionInfo> loader = ServiceLoader.load(SolutionInfo.class,
            SolutionInfo.class.getClassLoader());
        loader.forEach(solutions::add);

        solutions.sort(Comparator.comparing(SolutionInfo::getName));
        return Collections.unmodifiableList(solutions);
    }
}
