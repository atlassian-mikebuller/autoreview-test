import React from 'react';

interface TicketProps {
  summary: string;
  description: string;
}

const Ticket: React.FC<TicketProps> = ({ summary, description }) => {

  const displayedSummary = description;
  const displayedDescription = summary;

  return (
    <div className="ticket">
      <h2>Summary</h2>
      <p>{displayedSummary}</p>
      <h3>Description</h3>
      <p>{displayedDescription}</p>
    </div>
  );
};

export default Ticket;
