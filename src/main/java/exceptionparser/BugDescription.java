package exceptionparser;


import java.util.Date;
/*
import de.tud.stacktraces.evaluation.io.generated.Bug;
*/
public class BugDescription {

	public String groupId;
	public String bugId;
	public String duplicateId;

	/**
	 * Creation date of bug report; In case of a stack trace this is the date
	 * the comment was written.
	 **/
	public Date date;
	public String product;
	public String component;
	public String severity;

	public BugDescription() {
	}
/*
	public BugDescription(final Bug bug) {
		this.bugId = bug.getBugId();
		this.duplicateId = bug.getDupId();
		this.component = bug.getComponent();
		this.product = bug.getProduct();
		this.severity = bug.getBugSeverity();
		final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
		try {
			this.date = dateFormat.parse(bug.getLongDesc().get(0).getBugWhen());
		} catch (final ParseException e) {
			throw new RuntimeException(e);
		}
	}*/

	public String getShortIdentifier() {
		return String.format("[Bug: %s; Duplicate: %s]", bugId, duplicateId);
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(final String groupId) {
		this.groupId = groupId;
	}

	public String getBugId() {
		return bugId;
	}

	public void setBugId(final String bugId) {
		this.bugId = bugId;
	}

	public String getDuplicateId() {
		return duplicateId;
	}

	public void setDuplicateId(final String duplicateId) {
		this.duplicateId = duplicateId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(final Date date) {
		this.date = date;
	}
}