package org.dbrinkk.attachment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAttachmentRepository extends JpaRepository<Attachment, Integer> {
}
