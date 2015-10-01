package priycf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Priyanka Sekhar
 *
 */
public class InMemoryReportRepository implements ReportRepository {

	private static AtomicLong counter = new AtomicLong();

	private final ConcurrentMap<Long, Report> Reports = new ConcurrentHashMap<Long, Report>();

	@Override
	public Iterable<Report> findAll() {
		return this.Reports.values();
	}

	@Override
	public Report save(Report Report) {
		Long id = Report.getId();
		if (id == null) {
			id = counter.incrementAndGet();
			Report.setId(id);
		}
		this.Reports.put(id, Report);
		return Report;
	}

	@Override
	public Report findReport(Long id) {
		return this.Reports.get(id);
	}

}
