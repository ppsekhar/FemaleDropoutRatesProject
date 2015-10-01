package priycf;

/**
 * @author Priyanka Sekhar
 *
 */
public interface ReportRepository {

	Iterable<Report> findAll();

	Report save(Report report);

	Report findReport(Long id);
	
}
